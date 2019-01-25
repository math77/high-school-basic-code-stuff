#joguinho feito por Matheus Emanuel, para passar o tempo

from random import randint

numero = int (randint(0,9))

palpite = 0
tentativa = 0

while palpite != numero:
	palpite = int(input("Digite um numero "))

	tentativa += 1

	if palpite == numero:
		print ("Acertou o placar", tentativa)

	elif palpite < numero:
		print "Tente um valor maior"

	else:
	    print "Tente um valor menor"

print ("Fim de jogo")