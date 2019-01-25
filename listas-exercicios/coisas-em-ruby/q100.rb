puts "Digite a largura do ambiente:"
largura= gets.to_i
puts "Digite a profundidade do ambiente:"
profundidade= gets.to_i
mq= largura*profundidade 
potencia = mq*18
potencia_str = "%.1f" % potencia
puts "A potencia da lampada para esse ambiente e #{potencia_str}"