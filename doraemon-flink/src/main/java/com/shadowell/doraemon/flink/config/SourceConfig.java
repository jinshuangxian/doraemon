package com.shadowell.doraemon.flink.config;

import com.shadowell.doraemon.core.connectors.kafka.KafkaConfig;

/**
 * Author: Jie Feng
 * Date: Created in 2019/12/18
 */
public class SourceConfig {
	private KafkaConfig kafka;

	public KafkaConfig getKafka() {
		return kafka;
	}

	public void setKafka(KafkaConfig kafka) {
		this.kafka = kafka;
	}
}
