package pl

import spock.lang.Specification

/**
 * Created by Andrzej on 05.04.2017.
 */
class SimpleTest extends Specification {

    def "should return 2 from first element of list"() {
        given:
        List<Integer> list = new ArrayList<>()
        when:
        list.add(1)
        then:
        2 == list.get(0)
    }

    def "should return size 3"() {
        given:
        List list = Stub()
        list.size() >> 3
        expect:
        list.size() == 3
    }

}