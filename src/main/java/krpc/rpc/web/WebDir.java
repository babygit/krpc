package krpc.rpc.web;

public class WebDir {

    String hosts;
    String path;

    String staticDir;
    String templateDir;

    public WebDir(String hosts, String path) {
        this.hosts = hosts;
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public WebDir setPath(String path) {
        this.path = path;
        return this;
    }

    public String getStaticDir() {
        return staticDir;
    }

    public WebDir setStaticDir(String staticDir) {
        this.staticDir = staticDir;
        return this;
    }

    public String getTemplateDir() {
        return templateDir;
    }

    public WebDir setTemplateDir(String templateDir) {
        this.templateDir = templateDir;
        return this;
    }

    public String getHosts() {
        return hosts;
    }

    public WebDir setHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }

}
