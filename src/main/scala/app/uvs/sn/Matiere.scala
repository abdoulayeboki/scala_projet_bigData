package app.uvs.sn

class Matiere (code:String,libelle:String,coefficient:Int){
  private[this] var _codeMatiere: String = code
  private[this] var _libelleMatiere: String = libelle
  private[this] var _coefficientMatiere: Int = coefficient
  private[this] var _notes: List[Note] = null
  private[this] var _cours: List[Cours] = null

  def cours: List[Cours] = _cours

  def cours_=(value: List[Cours]): Unit = {
    _cours = value
  }
  // definition de la methode permettant d'ajouter une note dans la collection _notes
  def addNotes(note: Note): List[Note] = {
    notes = note+:_notes // ajout de la note au debut de la liste
    return notes
  }
  def notes: List[Note] = _notes

  def notes_=(value: List[Note]): Unit = {
    _notes = value
  }

  def codeMatiere: String = _codeMatiere

  def codeMatiere_=(value: String): Unit = {
    _codeMatiere = value
  }

  def libelleMatiere: String = _libelleMatiere

  def libelleMatiere_=(value: String): Unit = {
    _libelleMatiere = value
  }

  def coefficientMatiere: Int = _coefficientMatiere

  def coefficientMatiere_=(value: Int): Unit = {
    _coefficientMatiere = value
  }

  override def toString = s"Matiere($codeMatiere, $libelleMatiere)"
}
