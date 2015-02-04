package com.ctrip.hermes.producer;

import org.junit.Test;
import org.unidal.lookup.ComponentTestCase;

public class ProducerTest extends ComponentTestCase {
	@Test
	public void simpleSendWithoutLookup() {
		Producer p = Producer.getInstance();

		p.message("order.new", 12345L).send();
	}

	@Test
	public void simpleSend() {
		Producer p = lookup(Producer.class);

		p.message("order.new", 12345L).send();
	}

	@Test
	public void sendWithKey() {
		Producer p = lookup(Producer.class);

		p.message("order.new", 12345L).withKey("key12345").send();
	}

	@Test
	public void sendWithPriority() {
		Producer p = lookup(Producer.class);

		p.message("order.new", 12345L).withPriority().send();
	}

}