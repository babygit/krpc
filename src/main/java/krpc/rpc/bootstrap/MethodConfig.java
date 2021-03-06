package krpc.rpc.bootstrap;

public class MethodConfig {

    String pattern; // regex to match method name or 1,2,3-5,8 to specify msgIds

    // for referer's methods
    int timeout = 3000;
    int retryCount = 2;
    boolean retryBroken = false; // not safe, the receiver may receive more than once

    // for service's methods
    int threads = -1;
    int maxThreads = -1;
    int queueSize = 10000;

    public MethodConfig() {
    }

    public MethodConfig(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    public MethodConfig setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    public int getTimeout() {
        return timeout;
    }

    public MethodConfig setTimeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public MethodConfig setRetryCount(int retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    public int getThreads() {
        return threads;
    }

    public MethodConfig setThreads(int threads) {
        this.threads = threads;
        return this;
    }

    public int getQueueSize() {
        return queueSize;
    }

    public MethodConfig setQueueSize(int queueSize) {
        this.queueSize = queueSize;
        return this;
    }

    public int getMaxThreads() {
        return maxThreads;
    }

    public MethodConfig setMaxThreads(int maxThreads) {
        this.maxThreads = maxThreads;
        return this;
    }

    public boolean isRetryBroken() {
        return retryBroken;
    }

    public MethodConfig setRetryBroken(boolean retryBroken) {
        this.retryBroken = retryBroken;
        return this;
    }
}
