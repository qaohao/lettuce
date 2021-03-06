/*
 * Copyright 2011-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lambdaworks.redis.cluster.topology;

import com.lambdaworks.redis.cluster.models.partitions.RedisClusterNode;

/**
 * @author Mark Paluch
 */
class RedisClusterNodeSnapshot extends RedisClusterNode {

    private Long latencyNs;
    private Integer connectedClients;

    public RedisClusterNodeSnapshot() {
    }

    public RedisClusterNodeSnapshot(RedisClusterNode redisClusterNode) {
        super(redisClusterNode);
    }

    Long getLatencyNs() {
        return latencyNs;
    }

    void setLatencyNs(Long latencyNs) {
        this.latencyNs = latencyNs;
    }

    Integer getConnectedClients() {
        return connectedClients;
    }

    void setConnectedClients(Integer connectedClients) {
        this.connectedClients = connectedClients;
    }
}
