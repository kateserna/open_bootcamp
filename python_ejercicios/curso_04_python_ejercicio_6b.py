class Alumno:
    nombre : str = None
    nota : float = None

    def __init__(self, nombre : str, nota : float) -> None:
        self.nombre = nombre
        self.nota = nota
        
    def imprimirAtributos(self) ->None:
        print("Señor(a):", self.nombre)
        print("Su nota es:", self.nota)

    def imprimirAprobo(self) -> None:
        if self.nota >= 3:
            print("Su nota es:", self.nota, "Aprobado")
        else:
            print("Su nota es:", self.nota, "No ha aprobado")  
        
a = Alumno("Leonardo", 4.0)
b = Alumno("Mateo", 2.9)

a.imprimirAtributos()
a.imprimirAprobo()
b.imprimirAtributos()
b.imprimirAprobo()
