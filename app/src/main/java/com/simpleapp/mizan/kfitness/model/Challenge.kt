package com.simpleapp.mizan.kfitness.model

class Challenge {
    var title: String = ""
    var description: String = ""
    var image: String = ""
    var distance: String = ""
    var timeLeft: String = ""
    var like: String = ""

    constructor(title: String, description: String, image: String, distance: String, timeLeft: String, like: String) {
        this.title = title
        this.description = description
        this.image = image
        this.distance = distance
        this.timeLeft = timeLeft
        this.like = like
    }
}