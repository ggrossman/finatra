junit_tests(
  dependencies=[
    '3rdparty/jvm/com/google/inject/extensions:guice-assistedinject',
    '3rdparty/jvm/com/google/inject/extensions:guice-multibindings',
    '3rdparty/jvm/com/google/inject/extensions:guice-testlib',
    '3rdparty/jvm/com/google/inject:guice',
    '3rdparty/jvm/net/codingwell:scala-guice',
    '3rdparty/jvm/org/mockito:mockito-all',
    '3rdparty/jvm/org/scalatest:scalatest',
    '3rdparty/jvm/org/slf4j:slf4j-api',
    '3rdparty/jvm/org/specs2:mock',
    'finagle/finagle-http/src/main/scala',
    'finatra/examples/web-dashboard/src/main/scala',
    'finatra/http/src/test/scala:test-deps',
    'finatra/inject/inject-core/src/main/scala',
    'finatra/inject/inject-core/src/test/scala:test-deps',
    'finatra/inject/inject-server/src/test/scala:test-deps',
    'util/util-slf4j-api/src/main/scala',
    'finatra/examples/web-dashboard/src/test/resources',
  ],
  excludes=[
    exclude(org='org.slf4j', name='slf4j-jdk14')
  ],
  fatal_warnings=True,
  sources=rglobs('*.scala'),
)
