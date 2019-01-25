puts " digite a primeira nota"
nota1 = gets.to_f
puts "digite o peso da primeira nota"
peso1 = gets.to_f
puts "digite a segunda nota"
nota2 = gets.to_f
puts "digite o peso da segunda nota"
peso2 = gets.to_f
puts "a sua media e "
media = ((nota1*peso1)+(nota2*peso2))/(peso1+peso2)
puts "%.2f" % media
