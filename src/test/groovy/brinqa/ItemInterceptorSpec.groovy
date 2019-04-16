package brinqa

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class ItemInterceptorSpec extends Specification implements InterceptorUnitTest<ItemInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test item interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"item")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
