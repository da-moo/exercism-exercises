class Hamming
  VERSION = 1
  def self.compute(strand1, strand2)
    raise ArgumentError unless strand1.size == strand2.size
    strand1.split('').zip(strand2.split('')).count { |x, y| x != y }
  end
end
