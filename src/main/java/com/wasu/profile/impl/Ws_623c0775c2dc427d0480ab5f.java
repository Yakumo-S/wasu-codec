package com.wasu.profile.impl;

import cn.hutool.json.JSONUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.wasu.profile.CodecService;
import com.wasu.profile.CodecUPRequest;
import com.wasu.profile.CodecUPRequest.MessageType;
import java.util.HashMap;
import java.util.Map;

/**
 * 类名使用简称_productKey(华数物联网平台生成)
 * <p>
 * 1、实现provider的值为Java全限定名！！！很重要
 * <p>
 * 2、实现decode和encode方法
 * <p>
 * 3、完成单元测试！！很重要
 */
public class Ws_623c0775c2dc427d0480ab5f implements CodecService {

  private static final Log logger = LogFactory.get();
  public final static String provider = "com.wasu.profile.impl.Ws_623c0775c2dc427d0480ab5f";

  @Override
  public String provider() {
    return provider;
  }

  @Override
  public String decode(String payload) {
    logger.info("某温度传感器,收到decode={}", payload);
    //具体解析报文，CodecUPRequest格式
    Map<String, Object> properties = new HashMap<>();
    properties.put("temperature", 16);
    //封装结构报文
    CodecUPRequest result = new CodecUPRequest();
    result.setProperties(properties);
    result.setMessageType(MessageType.PROPERTIES);

    return JSONUtil.toJsonStr(result);
    //如果一次性产生多个事件或者属性上报可以使用List
//    List<CodecUPRequest> collectList = Stream.of(result, result).collect(Collectors.toList());
//    return JSONUtil.toJsonStr(collectList);

  }

  @Override
  public String encode(String payload) {
    logger.info("某温度传感器,收到encode={}", payload);
    //具体功能下发
    return "";
  }


}
