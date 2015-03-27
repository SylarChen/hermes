package com.ctrip.hermes.core.transport.command.parser;

import com.ctrip.hermes.core.transport.command.Command;

import io.netty.buffer.ByteBuf;

/**
 * @author Leo Liang(jhliang@ctrip.com)
 *
 */
public interface CommandParser {

	/**
	 * @param frame
	 * @return
	 */
	Command parse(ByteBuf frame);

}
