package krpc.rpc.cluster.lb;

import com.google.protobuf.Message;
import krpc.common.Plugin;
import krpc.rpc.cluster.Addr;
import krpc.rpc.cluster.LoadBalance;
import krpc.rpc.cluster.Weights;
import krpc.rpc.core.ClientContextData;
import krpc.rpc.core.ReflectionUtils;
import krpc.rpc.util.MurmurHash;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class HashLoadBalance implements LoadBalance {

    String getter;
    Random rand = new Random();

    public void config(String paramsStr) {
        Map<String, String> params = Plugin.defaultSplitParams(paramsStr);
        String s = params.get("hashField");
        if (s != null && s.length() > 0)
            getter = "get" + Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    public int select(List<Addr> addrs, Weights weights, ClientContextData ctx, Message req) {
        int index = getIndex(addrs, req);
        if (index < 0) return rand.nextInt(addrs.size());
        return index;
    }

    int getIndex(List<Addr> addrs, Message req) {
        if (getter == null) return -1;
        Object o = ReflectionUtils.invokeMethod(req, getter);
        if (o == null) return -1;

        long hash = MurmurHash.hash(o.toString());
        int idx = (int) (hash % addrs.size());
        return idx < 0 ? idx * (-1) : idx;
    }

}

