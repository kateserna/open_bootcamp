import time  
hora = time.localtime().tm_hour
minutos = time.localtime().tm_min

def horaDeSalida() -> None:
    if hora >= 19:
        print("Es hora de ir a casa")
    else:
        if minutos == 0:
            restaHora = 19 - hora
            restaMinutos = minutos
        else: 
            restaHora = 18 - hora
            restaMinutos = 60 - minutos

        print("Falta", restaHora, "horas", restaMinutos, "minutos para ir a casa")
