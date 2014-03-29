case-description:
	cd case_description_src/; \
	  pdflatex main.tex; \
	  bibtex main; \
	  pdflatex main.tex; \
	  pdflatex main.tex; \
	  cp main.pdf ../case_description.pdf
