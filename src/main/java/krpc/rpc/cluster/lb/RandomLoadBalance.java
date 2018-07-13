package krpc.rpc.cluster.lb;

import com.google.protobuf.Message;
import krpc.rpc.cluster.Addr;
import krpc.rpc.cluster.LoadBalance;
import krpc.rpc.cluster.Weights;
import krpc.rpc.core.ClientContextData;

import java.util.List;
import java.util.Random;

public class RandomLoadBalance implements LoadBalance {
    Random rand = new Random();

    public int select(List<Addr> addrs, Weights weights, ClientContextData ctx, Message req) {
        int r = rand.nextInt(addrs.size());
        return r;
    }
}