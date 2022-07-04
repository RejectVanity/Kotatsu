package org.koitharu.kotatsu.list.ui.adapter

import org.koitharu.kotatsu.base.ui.list.OnListItemClickListener
import org.koitharu.kotatsu.parsers.model.Manga
import org.koitharu.kotatsu.parsers.model.MangaTag

interface MangaListListener : OnListItemClickListener<Manga>, ListStateHolderListener {

	fun onTagRemoveClick(tag: MangaTag)
	
	fun onFilterClick()
}