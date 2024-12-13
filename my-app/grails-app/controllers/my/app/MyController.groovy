package my.app

class MyController {

    MyService myService

    def index() {
        myService.serviceMethod()
        render([status: 200] as Map)
    }
}
