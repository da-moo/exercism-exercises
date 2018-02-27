class Robot
  attr_reader :name
  @@assigned_names = Array.new

  def initialize
    reset
  end

  def reset
    loop do
      @name = '%s%03d' % [ (0...2).map { ('A'..'Z').to_a[rand(26)] }.join,
                          rand(100) ]
      break unless @@assigned_names.include?(@name)
    end
    @@assigned_names.push(@name)
  end
end
