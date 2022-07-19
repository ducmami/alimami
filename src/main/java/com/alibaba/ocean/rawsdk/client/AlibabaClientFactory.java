/**
 * 
 */
package com.alibaba.ocean.rawsdk.client;

import com.alibaba.ocean.rawsdk.client.entity.AuthorizationTokenStore;
import com.alibaba.ocean.rawsdk.client.http.mapi.SyncMapiClient;
import com.alibaba.ocean.rawsdk.client.imp.serialize.HttpRequestSerializer;
import com.alibaba.ocean.rawsdk.client.imp.serialize.Json2Deserializer;
import com.alibaba.ocean.rawsdk.client.imp.serialize.JsonDeserializer;
import com.alibaba.ocean.rawsdk.client.imp.serialize.Param2Deserializer;
import com.alibaba.ocean.rawsdk.client.imp.serialize.Param2RequestSerializer;
import com.alibaba.ocean.rawsdk.client.imp.serialize.ParamDeserializer;
import com.alibaba.ocean.rawsdk.client.imp.serialize.ParamRequestSerializer;
import com.alibaba.ocean.rawsdk.client.imp.serialize.Xml2Deserializer;
import com.alibaba.ocean.rawsdk.client.policy.ClientPolicy;
import com.alibaba.ocean.rawsdk.client.serialize.SerializerProvider;

/**
 * @author hongbang.hb
 *
 */
public class AlibabaClientFactory {

	protected SerializerProvider initSerializerProvider() {
		SerializerProvider serializerProvider = new SerializerProvider();
		serializerProvider.register(new Xml2Deserializer());
		serializerProvider.register(new JsonDeserializer());
		serializerProvider.register(new Json2Deserializer());
		serializerProvider.register(new ParamDeserializer());
		serializerProvider.register(new Param2Deserializer());

		serializerProvider.register(new HttpRequestSerializer());
		serializerProvider.register(new ParamRequestSerializer());
		serializerProvider.register(new Param2RequestSerializer());
		return serializerProvider;
	}

	public SyncAPIClient createAPIClient(ClientPolicy policy, AuthorizationTokenStore authorizationTokenStore) {

		SerializerProvider serializerProvider = initSerializerProvider();

		final SyncAPIClient syncAPIClient = new SyncAPIClient(policy, serializerProvider, authorizationTokenStore);
		syncAPIClient.start();
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				if (syncAPIClient != null) {
					syncAPIClient.shutdown();
				}
			}
		});
		return syncAPIClient;
	}

	public SyncMapiClient createMAPIClient(ClientPolicy policy, AuthorizationTokenStore authorizationTokenStore) {

		SerializerProvider serializerProvider = initSerializerProvider();

		final SyncMapiClient syncMAPIClient = new SyncMapiClient(policy, serializerProvider, authorizationTokenStore);
		syncMAPIClient.start();
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				if (syncMAPIClient != null) {
					syncMAPIClient.shutdown();
				}
			}
		});
		return syncMAPIClient;
	}
}
