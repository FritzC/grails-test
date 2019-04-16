package brinqa

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class CartInterceptorSpec extends Specification implements InterceptorUnitTest<CartInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test cart interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"cart")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
