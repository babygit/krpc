// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package com.xxx.userservice.proto;

public interface HttpPluginTestService {

    static final public int serviceId = 104;

    com.xxx.userservice.proto.HttpPluginTestRes test1(com.xxx.userservice.proto.HttpPluginTestReq req);

    static final public int test1MsgId = 1;

    com.xxx.userservice.proto.HttpDownloadStaticRes test2(com.xxx.userservice.proto.HttpPluginTestReq req);

    static final public int test2MsgId = 2;

    com.xxx.userservice.proto.HttpUploadTestRes upload1(com.xxx.userservice.proto.HttpUploadTestReq1 req);

    static final public int upload1MsgId = 3;

    com.xxx.userservice.proto.HttpUploadTestRes upload2(com.xxx.userservice.proto.HttpUploadTestReq2 req);

    static final public int upload2MsgId = 4;

}

