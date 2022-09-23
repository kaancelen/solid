override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val item = itemList.get(position)

    holder.title.text = item.name
    holder.title.description = item.description

    try {
        val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
        holder.registerDate.text = simpleDateFormat.format(item.registerDate)
    } catch (ex: Exception) {
        holder.registerDate.text = "Unavailable"
    }
}