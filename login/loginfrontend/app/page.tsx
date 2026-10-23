import Link from "next/link";

export default function Home() {
  return (
    <div className="flex-1 flex flex-col justify-center items-center px-4 py-16 sm:py-24">
      {/* Background Gradient Blur */}
      <div className="absolute inset-0 -z-10 flex items-center justify-center overflow-hidden">
        <div className="w-[45rem] h-[25rem] bg-gradient-to-tr from-indigo-500/20 via-purple-500/20 to-cyan-400/20 rounded-full blur-3xl transform -translate-y-12" />
      </div>

      <div className="max-w-3xl text-center space-y-6">
        <div className="inline-flex items-center gap-2 px-3 py-1 rounded-full text-xs font-semibold bg-indigo-50 dark:bg-indigo-950/60 text-indigo-600 dark:text-indigo-400 border border-indigo-200/60 dark:border-indigo-800/60 shadow-sm">
          <span className="w-2 h-2 rounded-full bg-emerald-500 animate-pulse" />
          Backend Live on Spring Boot 3.3
        </div>

        <h1 className="text-4xl sm:text-6xl font-extrabold tracking-tight text-zinc-900 dark:text-white">
          Secure Full-Stack{" "}
          <span className="bg-gradient-to-r from-indigo-600 via-purple-600 to-cyan-500 bg-clip-text text-transparent">
            Authentication
          </span>
        </h1>

        <p className="text-base sm:text-lg text-zinc-600 dark:text-zinc-300 max-w-2xl mx-auto leading-relaxed">
          A modern Next.js frontend seamlessly integrated with a Spring Security backend
          featuring stateless JSON Web Tokens, BCrypt password hashing, and MySQL persistence.
        </p>

        {/* CTA Buttons */}
        <div className="flex flex-col sm:flex-row items-center justify-center gap-4 pt-4">
          <Link
            href="/login"
            className="w-full sm:w-auto px-8 py-3.5 rounded-xl font-semibold text-white bg-indigo-600 hover:bg-indigo-500 shadow-lg shadow-indigo-600/30 transition-all hover:scale-[1.02] active:scale-[0.98]"
          >
            Sign In to Dashboard
          </Link>
          <Link
            href="/signup"
            className="w-full sm:w-auto px-8 py-3.5 rounded-xl font-semibold text-zinc-800 dark:text-zinc-200 bg-white dark:bg-zinc-900 border border-zinc-300 dark:border-zinc-800 hover:bg-zinc-50 dark:hover:bg-zinc-800/70 transition-all shadow-sm hover:scale-[1.02] active:scale-[0.98]"
          >
            Create New Account
          </Link>
        </div>
      </div>
    </div>
  );
}
