package tarefas

class Usuario {

    String nome
	String email
	String senha
	
	static constraints = {
		nome{nullable:false; maxSize:255}
		email{nullable:false; maxSize:255; email:true}
		senha{nullable:false; maxSize:32}
    }

    String toString(){
        this.nome
    }
}
