class Bob
  def hey(remark)
    /[A-Z]{4,}!*|[A-Z]+!+/.match(remark) { return 'Whoa, chill out!' }
    /\?+\z/.match(remark) { return 'Sure.' }
    remark.strip == '' ? 'Fine. Be that way!' : 'Whatever.'
  end
end
