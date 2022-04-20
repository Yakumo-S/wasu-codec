package com.wasu.profile;

/**
 * 编解码接口，建议一款设备一个实现。
 * <p>
 * 实现类命名建议使用，厂商简称_产品productKey
 * <p>
 * 例：DH_623c0775c2dc427d0480ab5f
 */
public interface CodecService {

  /**
   * 实现类,包的全限定命名
   * <p>
   * 例：com.wasu.profile.impl.Wasu_625f60d4c2dc7c745cf30040
   *
   * @return 编解码提供者
   */
  String provider();


  /**
   * 编码
   * <p>
   * 基于物模型转为设备可读取的字符串（16进制，JSON等）
   * <p>
   *
   * @param payload 字符串或其他
   * @return
   */
  public String encode(String payload);

  /**
   * 解码
   * <p>
   * 设备数据转为基于物模型的属性和事件。
   * <p>
   * 返回例:{"messageType":"PROPERTIES","properties":{},"event":"","data":{}}
   *
   * @param payload 设备上报消息串。不同平台或者不同设备不一样。
   * @return
   */
  public String decode(String payload);

}
