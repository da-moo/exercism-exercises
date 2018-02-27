class Prime
  @@primes = [2, 3]

  def self.nth(num)
    raise ArgumentError if num < 1
    result = @@primes.fetch(num - 1, nil)
    return result unless result.nil?
    last_prime = @@primes.last
    until @@primes.length == num
      x = last_prime + 2
      @@primes << x if is_prime?(x)
      last_prime += 2
    end
    @@primes.last
  end

  def self.is_prime?(x)
    sq_root = Math.sqrt(x).ceil
    @@primes.each do |prime|
      return false if x % prime == 0
      break if prime  > sq_root
    end
    true
  end
end
