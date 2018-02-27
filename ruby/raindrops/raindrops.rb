class Raindrops
  VERSION = 1
  def self.convert(number)
    output = number % 3 == 0 ? 'Pling' : ''
    output += number % 5 == 0 ? 'Plang' : ''
    output += number % 7 == 0 ? 'Plong' : ''
    output = output.empty? ? number.to_s : output
  end
end
