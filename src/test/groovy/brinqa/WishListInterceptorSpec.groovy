package brinqa

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class WishListInterceptorSpec extends Specification implements InterceptorUnitTest<WishListInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test wishList interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"wishList")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
