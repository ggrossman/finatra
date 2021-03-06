package com.twitter.finatra.tests.utils

import com.twitter.finatra.modules.CredentialsModule
import com.twitter.finatra.utils.Credentials
import com.twitter.inject.IntegrationTest
import com.twitter.inject.app.TestInjector

class CredentialsIntegrationTest extends IntegrationTest {

  override val injector =
    TestInjector(CredentialsModule).create

    test("load empty credentials") {
      val credentials = injector.instance[Credentials]
      credentials.isEmpty should be(true)
      credentials.get("foo") should be(None)
    }
}
