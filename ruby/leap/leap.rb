class Year
  VERSION = 1
  def self.leap?(year)
    (year.modulo(4).zero? && !year.modulo(100).zero?) || year.modulo(400).zero?
  end
end
