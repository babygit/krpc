// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package com.xxx.userservice.proto;

public interface HttpDownloadStaticResOrBuilder extends
        // @@protoc_insertion_point(interface_extends:HttpDownloadStaticRes)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retCode = 1;</code>
     */
    int getRetCode();

    /**
     * <code>string retMsg = 2;</code>
     */
    java.lang.String getRetMsg();

    /**
     * <code>string retMsg = 2;</code>
     */
    com.google.protobuf.ByteString
    getRetMsgBytes();

    /**
     * <code>string downloadFile = 3;</code>
     */
    java.lang.String getDownloadFile();

    /**
     * <code>string downloadFile = 3;</code>
     */
    com.google.protobuf.ByteString
    getDownloadFileBytes();

    /**
     * <code>string autoDelete = 4;</code>
     */
    java.lang.String getAutoDelete();

    /**
     * <code>string autoDelete = 4;</code>
     */
    com.google.protobuf.ByteString
    getAutoDeleteBytes();

    /**
     * <code>int32 attachment = 5;</code>
     */
    int getAttachment();

    /**
     * <code>int32 expire = 6;</code>
     */
    int getExpire();

    /**
     * <code>bytes downloadStream = 7;</code>
     */
    com.google.protobuf.ByteString getDownloadStream();

    /**
     * <code>string filename = 8;</code>
     */
    java.lang.String getFilename();

    /**
     * <code>string filename = 8;</code>
     */
    com.google.protobuf.ByteString
    getFilenameBytes();
}
