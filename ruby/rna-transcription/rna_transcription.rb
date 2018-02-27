class Complement
  VERSION = 3
  def self.of_dna(dna_strand)
    raise ArgumentError unless /\A[GCTA]+\z/.match(dna_strand)
    dna_strand.tr('GCTA', 'CGAU')
  end
end
