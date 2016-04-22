package org.seekay.kv.acceptance;

import org.junit.Test;
import org.seekay.contract.client.client.ContractClient;

public class KvServerContractTests {

	@Test
	public void runContractTestsAgainstServer() {

		ContractClient.newClient().againstPath("http://localhost:8090")
				.withGitConfig("https://github.com/harmingcola/kvContracts.git")
				.runTests();

	}
}
