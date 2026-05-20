package com.lowagie.text.pdf;

public interface PdfPTableEventAfterSplit extends PdfPTableEventSplit {
	public void afterSplitTable(PdfPTable table, PdfPRow startRow, int startIdx);
}
