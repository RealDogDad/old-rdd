## Nate Ebel - @n8ebel
### Hey devs 👋

I enjoy building great software and helping others do the same.

[![Email n8ebel](https://img.shields.io/badge/Email-n8ebel@goobar.dev-red?style=for-the-badge)](mailto:n8ebel@goobar.dev)
<br>
[![Website n8ebel](https://img.shields.io/badge/Website-@goobar-yellow?style=for-the-badge)](https://goobar.io/)
[![Twitter n8ebel](https://img.shields.io/badge/Twitter-@n8ebel-9cf?style=for-the-badge)](https://twitter.com/n8ebel)
[![LinkedIn n8ebel](https://img.shields.io/badge/LinkedIn-@n8ebel-blue?style=for-the-badge)](https://www.linkedin.com/in/n8ebel/)
<br>
[![YouTube n8ebel](https://img.shields.io/badge/YouTube-@goobar-red?style=for-the-badge)](https://www.youtube.com/c/goobar)
[![Podcast n8ebel](https://img.shields.io/badge/Podcast-@goobar-blueviolet?style=for-the-badge)](https://goobar.buzzsprout.com/)


```kotlin
object Nate {
 val name = "Nate Ebel"
 val acknowledgements = "Google Developer Expert"
 
 val primarySkillset = "Android"
 val languages = listOf("Kotlin", "Java", "Python")

 val website = "https://goobar.io/"
 val youtube = "http://youtube.com/c/goobar"
 val podcast = "https://goobar.buzzsprout.com/"
 val contact = "@n8ebel".apply {
   twitter = this
   linkedin = this
   email = "$this@goobar.dev"
 }
 
 val publishedBooks = listOf("Mastering Kotlin")
 val publishedCourses 
     = listOf(
         "Getting Started with Android Development" to "Pluralsight", 
         "AD340 - Intro to Android Development" to "North Seattle College",
         "Intro to Kotlin" to "freeCodeCamp"
         )

}
``