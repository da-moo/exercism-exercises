class FoodChain
  VERSION = 2
  ANIMALS = { fly: 'I don\'t know why she swallowed the fly. Perhaps she\'ll die.',
              spider: 'It wriggled and jiggled and tickled inside her.',
              bird: 'How absurd to swallow a bird!',
              cat: 'Imagine that, to swallow a cat!',
              dog: 'What a hog, to swallow a dog!',
              goat: 'Just opened her throat and swallowed a goat!',
              cow: 'I don\'t know how she swallowed a cow!',
              horse: 'She\'s dead, of course!' }

  def self.song
    constructed_song = intro(:fly) << "\n"
    ANIMALS.keys[1..-2].each do |animal|
      constructed_song << intro(animal) << middle(animal) << ending << "\n"
    end
    constructed_song << intro(:horse)
  end

  private

    def self.intro(animal)
      "I know an old lady who swallowed a #{animal}.\n" + ANIMALS[animal] + "\n"
    end

    def self.middle(animal)
      constructed_middle = ''
      index_of_animal = ANIMALS.keys.index(animal)
      animals_in_middle = ANIMALS.keys[0..index_of_animal].reverse
      animals_in_middle.each_with_index do |animal, i|
        break if animal == :fly
        previous_animal = animals_in_middle[i+1]
        ending = animal == :bird ? ' that wriggled and jiggled and ' +
                                   'tickled inside her' : ''
        constructed_middle += "She swallowed the #{animal} to catch the " +
                              "#{previous_animal}#{ending}.\n"
      end
      constructed_middle
    end

    def self.ending
      ANIMALS[:fly] + "\n"
    end
end
