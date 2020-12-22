package app.uvs.sn

class Etudiant (var id:Int, nom:String, prenom:String, niveau:Niveau){
  // definition des attributs
  private[this] var _idEtudiant: Int = id
  private[this] var _nomEtudiant: String = nom
  private[this] var _prenomEtudiant: String = prenom
  private[this] var _niveauEtudiant: Niveau = niveau

  def idEtudiant: Int = _idEtudiant

  def idEtudiant_=(value: Int): Unit = {
    _idEtudiant = value
  }

  def nomEtudiant: String = _nomEtudiant

  def nomEtudiant_=(value: String): Unit = {
    _nomEtudiant = value
  }

  def prenomEtudiant: String = _prenomEtudiant

  def prenomEtudiant_=(value: String): Unit = {
    _prenomEtudiant = value
  }


  def niveauEtudiant: Niveau = _niveauEtudiant

  def niveauEtudiant_=(value: Niveau): Unit = {
    _niveauEtudiant = value
  }

  override def toString = s"Etudiant($idEtudiant, $nomEtudiant, $prenomEtudiant, $niveauEtudiant)"
}
