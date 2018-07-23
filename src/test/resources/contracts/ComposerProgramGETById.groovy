package contracts


import org.springframework.cloud.contract.spec.Contract

Contract.make {

    description "should return program by id"

    request {
        method("GET")
        url("/composer/programs/1")
    }

    response {
        status 200
        body(["id":1, "name": "program name"])
        headers {
            contentType("application/json")
        }
    }

}