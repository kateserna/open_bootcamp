class Vehiculo:
    color : str = None
    ruedas : int = None
    puertas : int = None

    def __init__(self, color : str, ruedas : int, puertas : int) -> None:
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas
        print("Color:",color) 
        print("Numero de ruedas:", ruedas)
        print("Numero de puertas", puertas)
 
class Coche(Vehiculo):
    velocidad : str = None
    cilindrada : int = None

    def __init__(self, color : str, ruedas : int, puertas : int, velocidad : str, cilindrada : int) -> None:
        super().__init__(color, ruedas, puertas)
        self.velocidad = velocidad
        self.cilindrada = cilindrada
        print("Velocidad:", velocidad)
        print("Cilindrada:", cilindrada)


sandero = Coche('Gris', 4, 5, '150 km/h', 1600)

