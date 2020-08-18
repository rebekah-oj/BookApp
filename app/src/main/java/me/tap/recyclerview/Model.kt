package me.tap.recyclerview

data class Books(var title: String)

object Supplier {

    val books = listOf(
        Books("ATOMIC HABITS – JAMES CLEAR"),
        Books("BOUNDARIES – DR HENRY CLOUD & DR. JOHN TOWNSEND"),
        Books("FEEL THE FEAR AND DO IT ANYWAY – SUSAN JEFFERS"),
        Books("POLISH YOUR POISE – JENNIFER L SCOTT"),
        Books("A WOMAN’S INFLUENCE -TONY GASKIN"),
        Books("SACRED WOMEN – QUEIN AFUA"),
        Books("HOW TO DATE – INDIA KING"),
        Books("ACT LIKE A LADY, THINK LIKE A MAN – STEVE HARVEY"),
        Books("THE SECRET – RHONDA BYRNE"),
        Books("START WITH WHY – SIMON SINEK"),
        Books("THE CONFIDENCE GAP – RUSS HARRIS"),
        Books("YOUR ERRONEOUS ZONES – WAYNE W. DYER"),
        Books("FEMININITY – SUSAN BROWNMILLER")
    )
}