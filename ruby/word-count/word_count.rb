class Phrase
  attr_reader :word_count
  VERSION = 1

  def initialize(phrase)
    @word_count = Hash.new(0)
    phrase.downcase.scan(/\w+'+\w+|\w+/).each do |word|
      @word_count[word] += 1
    end
    @word_count
  end
end
