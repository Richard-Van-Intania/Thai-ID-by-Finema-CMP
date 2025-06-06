package co.finema.thaidotidbyfinema

interface Platform {
  val name: String
}

expect fun getPlatform(): Platform
