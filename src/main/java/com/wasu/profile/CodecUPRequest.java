package com.wasu.profile;

import java.util.Map;

/**
 * @author liulihai
 * @version 1.0
 * @date 2021/8/26
 */

public class CodecUPRequest {

  /**
   * 消息类型
   */
  private MessageType messageType;
  /**
   * 物模型定义的事件名称
   */
  private String event;
  /**
   * 产生事件对应的数据内容
   */
  private Map<String, Object> data;
  /**
   * 属性
   */
  private Map<String, Object> properties;
  /**
   * 暂无作用
   */
  private Map<String, Object> tags;

  public MessageType getMessageType() {
    return messageType;
  }

  public void setMessageType(MessageType messageType) {
    this.messageType = messageType;
  }

  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public Map<String, Object> getData() {
    return data;
  }

  public void setData(Map<String, Object> data) {
    this.data = data;
  }

  public Map<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public Map<String, Object> getTags() {
    return tags;
  }

  public void setTags(Map<String, Object> tags) {
    this.tags = tags;
  }

  /**
   * 消息类型
   */
  public enum MessageType {
    /**
     * 属性数据上报
     */
    PROPERTIES,
    /**
     * 事件
     */
    EVENT,
    /**
     * 指令响应
     */
    REPLY,
    /**
     * 功能
     */
    FUNCTIONS;
  }
}
