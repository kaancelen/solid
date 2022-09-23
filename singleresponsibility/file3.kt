override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val item = itemList.get(position)

    holder.title.text = item.name
    holder.title.description = item.description
    holder.registerDate.text = item.registerDateString()
}