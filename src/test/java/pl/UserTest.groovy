package pl

import spock.lang.Specification

/**
 * Created by Andrzej on 06.04.2017.
 */
class UserTest extends Specification {

    def "should print user with new role"() {
        given:
        User user = new User(Role.USER)
        /*Za każdym wywołaniem metody updateRoleAndReturnPreviousOne z jednym argumentem, gdy przekazanym
        * argumentem będzie Rola ADMIN, metoda zwróci wyjątek, w przeciwnym razie zwróci rolę*/
        user.updateRoleAndReturnPreviousOne(_) >> { Role role ->
            if (Role.ADMIN == role)
                throw new IllegalArgumentException()
            else
                return role;
        }
        when:
        Role oldRole = user.updateRoleAndReturnPreviousOne(Role.ADMIN)
        then:
        print(user)
        assert oldRole == Role.USER
    }
}