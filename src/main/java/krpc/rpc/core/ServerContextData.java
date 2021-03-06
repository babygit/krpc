package krpc.rpc.core;

import krpc.rpc.core.proto.RpcMeta;
import krpc.trace.TraceContext;

public class ServerContextData extends RpcContextData {

    Continue<RpcClosure> cont; // used in server side async call
    TraceContext traceContext;
    long waitInQueueMicros = 0;

    public ServerContextData(String connId, RpcMeta meta, TraceContext traceContext) {
        super(connId, meta);
        this.traceContext = traceContext;
        startMicros = traceContext.currentSpan().getStartMicros();
        requestTimeMicros = traceContext.getRequestTimeMicros() + (startMicros - traceContext.getStartMicros());
    }

    public Continue<RpcClosure> getContinue() {
        return cont;
    }

    public void setContinue(Continue<RpcClosure> cont) {
        this.cont = cont;
    }

    public TraceContext getTraceContext() {
        return traceContext;
    }

    public void afterQueue() {
        waitInQueueMicros = System.nanoTime() / 1000 - startMicros;
    }

    public long getWaitInQueueMicros() { return waitInQueueMicros;}
}
