package co.com.seguridog

class K9UserController {

    def scaffold = K9User

    def login = { }

    def index() { }

    def handleLogin = {
        def userlog = K9User.findByLoginUserAndLoginPass(params.loginUser, params.loginPass)
        if (userlog){
            session.user = userlog
            flash.message = "Bienvenido: ${userlog.firstName} ${userlog.lastName}"
            redirect(controller:'typeUser')
        } else {
            flash.message = "Usuario no encontrado: ${userlog.loginUser}"
            redirect(action:'login')
        }
    }

    def logout = {
        flash.message = "Adios ${session.user.firstName} ${session.user.lastName}"
        session.user = null
        redirect (action:'login')
    }

    def register = {
        if (request.method == 'POST'){
            def userNew = new K9User()
            userNew.properties['cedula', 'lastName','firstName','loginUser','loginPass','birthDate','cellphone','eMail'] = params
            if (userNew.loginPass != params.confirm){
                userNew.errors.rejectValue("loginPass", "no es el mismo")
                return [user:userNew]
            } else if (userNew.save()){
                session.user = userNew
                redirect(controller:"typeuser")
            } else {
                return [user:userNew]
            }
        }
    }

    def edit = {
        if (session.user.cedula != params.cedula){
            flash.message = "Solo puedes modificar tu usuario."
            redirect(action:list)
            return
        }

        def useredit = K9User.get(params.cedula)

        if (!useredit){
            flash.message = "Usuario no encontrado con la cédula: ${params.cedula}"
            redirect(action:list)
        } else {
            return[user : useredit]
        }
    }

}
