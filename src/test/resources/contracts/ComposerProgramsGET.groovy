package contracts


import org.springframework.cloud.contract.spec.Contract

Contract.make {

    description "should return all programs"

    request {
        method("GET")
        url("/composer/programs/")
    }

    response {
        status 200
        body([["id":1, "name": "program name"], ["id":2, "name": "other name"]])
        headers {
            contentType("application/json")
        }
    }

}