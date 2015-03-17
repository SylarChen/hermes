package com.ctrip.hermes.broker.remoting.netty;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.ctrip.hermes.channel.ConsumerChannel;
import com.ctrip.hermes.remoting.netty.AbstractNettyHandler;

public class NettyServerHandler extends AbstractNettyHandler {

	private Map<Long, ConsumerChannel> m_consumerChannels = new ConcurrentHashMap<>();

	public void addConsumerChannel(long correlationId, ConsumerChannel consumerChannel) {
		m_consumerChannels.put(correlationId, consumerChannel);
	}

	public ConsumerChannel getConsumerChannel(long correlationId) {
		return m_consumerChannels.get(correlationId);
	}

}
